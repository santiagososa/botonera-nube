$(document).ready(function() {
	
	// create all audio files and add click handler to each of them
    var audioArray = {}
    $('.button').click(function(e){
    		e.preventDefault();
    		var buttonId = $(this).attr('id');
    		var audio = $('#'+buttonId+'-button');
    		
    		console.info(audio[0].canPlayType('audio/mpeg'));
    		console.info(audio[0].canPlayType('audio/ogg'));
    		console.info(audio[0].canPlayType('audio/wav'));
    		
//    		if (audio.canPlayType('audio/mpeg;')) {
//    			console.log("holaaa")
//    		    source.type= 'audio/mpeg';
//    		    source.src= 'audio/song.mp3';
//    		} else {
//    		    source.type= 'audio/ogg';
//    		    source.src= 'audio/song.ogg';
//    		}
    		
    		audio[0].load();
    		audio[0].play();
    	});
});



