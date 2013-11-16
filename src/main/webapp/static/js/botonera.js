$(document).ready(function() {
	
	// create all audio files and add click handler to each of them
    var audioArray = {}
    $('.button').click(function(e){
    		e.preventDefault();
    		var buttonId = $(this).attr('id');
    		var audio = $('#'+buttonId+'-button');
    		console.info(audio);
    		audio[0].play();
    	});
});



