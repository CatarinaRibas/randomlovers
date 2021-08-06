$(document).ready(function () {
    $('#sidebarCollapse').on('click', function () {
        $('#sidebar').toggleClass('active');
    });
    start1();
});

var start1 = function(){

    var id = decodeURIComponent(window.location.search);
    id = id.substring(4);
    console.log(id);

    function successCallback(response) {
        console.log(response);
        createPage(response);
    }
    
    function errorCallback(request, status, error) {
       //window.location.href="500error.html";
    }
    
    // perform an ajax http get request
    $.ajax({
        url: 'http://192.168.1.21:8080/randomlovers/topics/' + id,
        async: true,
        success: successCallback,
        error: errorCallback
    });
}

var createPage = function(response){

    var title = $("#header2");
    $(title).text( response.name);

    var question = $("#question1");
    $(question).text(response.optionAName + " or " + response.optionBName + " ?");

    var optionA = $(".form-check-label3");
    $(optionA).text(response.optionAName);

    var optionB = $(".form-check-label4");
    $(optionB).text(response.optionBName);

    var picture = $("#childHotTopic3");
    
    result = "<img id='picture' src=" + response.imagePath + " alt='hot topic'/>" +
    "<figcaption id='picturecaption'>" + response.name + "</figcaption>";

    console.log(result);

    $(picture).append(result);


}


