$(document).ready(function() {
    start();
});

var start = function(){

    function successCallback(response) {
        console.log(response);
        createRandomPage(response);
    }
    
    function errorCallback(request, status, error) {
       //window.location.href="error.html";
    }
    
    // perform an ajax http get request
    $.ajax({
        url: 'http://192.168.1.21:8080/randomlovers/topics/random',
        async: true,
        success: successCallback,
        error: errorCallback
    });
}

var createRandomPage = function(response){

    console.log("hello")

    var title = $("#header1");
    $(title).text( response.name);

    var question = $("#question");
    $(question).text(response.optionAName + " or " + response.optionBName + " ?");

    var optionA = $(".form-check-label1");
    $(optionA).text(response.optionAName);

    var optionB = $(".form-check-label2");
    $(optionB).text(response.optionBName);

    var picture = $("#childHotTopic2");
    
    result = "<img id='picture' src=" + response.imagePath + " alt='hot topic'/>" +
    "<figcaption id='picturecaption'>" + response.name + "</figcaption>";

    console.log(result);

    $(picture).append(result);


}