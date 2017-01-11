//&callback=initMap
var GoogleCoords = [];
var DocCoordsPosi=[];
var finished = false;
var map;
var infoWindow;
function initMap() {
        map = new google.maps.Map(document.getElementById('map'), {
          zoom: 5,
          center: new google.maps.LatLng(-7.29576915383618,-39.0824566557438),
          mapTypeId: 'terrain'
        });
        loop_AddPoly();
}

function loop_AddPoly() {
        var j =0;
        for(var i =0;i<muniCoords.length;i++){
            coords = muniCoords[i];
            //console.log(i);
            setTimeout(addPoly(i,muniNome[i]),finished);
            finished=false;
        }
}

function addPoly(id,name){
        for(var i=0;i<coords.length;i++)
            GoogleCoords[i]= new google.maps.LatLng(coords[i][1],coords[i][0]);
        var Poly_Marker = new google.maps.Polygon({
          paths: GoogleCoords,
          strokeColor: '#FF0000',
          strokeOpacity: 0.8,
          strokeWeight: 3,
          fillColor: '#FF0000',
          fillOpacity: 0.35
        });
        Poly_Marker.nome = name;
        Poly_Marker.setMap(map);

        // Add a listener for the click event.
        Poly_Marker.addListener('click', showArrays);
        infoWindow = new google.maps.InfoWindow;

        GoogleCoords=[];
        finished=true;
}

  /** @this {google.maps.Polygon} */
function showArrays(event) {
        var vertices = this.getPath();
        var contentString = '<b>'+this.nome+'</b><br>' +
                'Clicked location: <br>' + event.latLng.lat() + ',' + event.latLng.lng() +
                '<br>';
        // Replace the info window's content and position.
        infoWindow.setContent(contentString);
        infoWindow.setPosition(event.latLng);
        infoWindow.open(map);
 }