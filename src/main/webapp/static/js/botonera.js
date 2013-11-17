$(document).ready(function() {
	
	// force loading all sounds, for browsers that do not support preload-auto
	$('audio').each(function(index, value){
		value.load();
	});
	
	// add click handler for playing
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



