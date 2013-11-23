<#import "/spring.ftl" as spring/>
<#import "util/main-template.ftl" as m>

<@m.main>

	<div class="row">
		<ul class="small-block-grid-1 large-block-grid-1">
	        	<li class="centered-content">
	                <audio autoplay controls preload="auto" >  
							<source src="/static/sounds/${sound}.ogg" type="audio/ogg" />
							<source src="/static/sounds/${sound}.mp3" type="audio/mpeg" />
							<source src="/static/sounds/${sound}.wav" type="audio/wav" />  
							<@spring.message code="message.oldBrowser"/>
	                </audio> 
                </li>
        </ul>
	</div>

</@m.main>
