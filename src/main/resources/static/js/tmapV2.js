var map, marker;
var lonlat;
var markers = [];

// 페이지가 로딩이 된 후 호출하는 함수입니다.
window.onload = function initTmap() {
    // map 생성
    // Tmapv2.Map을 이용하여, 지도가 들어갈 div, 넓이, 높이를 설정합니다.
    map = new Tmapv2.Map("map_div", {
        center: new Tmapv2.LatLng(37.56520450, 126.98702028), // 지도 초기 좌표
        width: "100%", // 지도의 넓이
        height: "80%", // 지도의 높이
        zoom: 17
    });

    map.addListener("click", onClick); //map 클릭 이벤트를 등록합니다.
}

addM
function onClick(e) {
    // 클릭한 위치에 새로 마커를 찍기 위해 이전에 있던 마커들을 제거
    removeMarkers();

    lonlat = e.latLng;
    //Marker 객체 생성.
    marker = new Tmapv2.Marker({
        position: new Tmapv2.LatLng(lonlat.lat(), lonlat.lng()), //Marker의 중심좌표 설정.
        map: map, //Marker가 표시될 Map 설정.
        draggable: true
    });

    console.log("lat =" + marker.getPosition().lat())
    console.log("lng =" + marker.getPosition().lng())
    markers.push(marker);

    marker.addListener("dragend", function (evt) {
        console.log("마커 드래그 이벤트")
        console.log("lat =" + marker.getPosition().lat())
        console.log("lng =" + marker.getPosition().lng())

    })

}

// 모든 마커를 제거하는 함수입니다.
function removeMarkers() {
    for (var i = 0; i < markers.length; i++) {
        markers[i].setMap(null);
    }
    markers = [];
}

