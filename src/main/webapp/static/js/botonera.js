$(document).ready(function() {
	
	// create all audio files and add click handler to each of them
    var audioArray = {}
    $('.button').click(function(e){
    		e.preventDefault();
    		var buttonId = $(this).attr('id');
    		var audio = $('#'+buttonId+'-button');
    		var playable = audio[0];

    		//play and reload for future playing (some browsers need this!)
    		playable.play();
    		playable.addEventListener('ended', function(){
    			playable.load();
    		});

    		
    	});
});



