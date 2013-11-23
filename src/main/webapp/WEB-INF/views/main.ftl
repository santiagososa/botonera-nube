<#import "/spring.ftl" as spring/>
<#import "util/main-template.ftl" as m>

<@m.main>

	<div class="row">
		<ul class="small-block-grid-2 large-block-grid-4">
			<#list sounds?keys as soundKey>
	        	<li class="centered-content">
	                <a href="#" id="${soundKey}" class="button round ${sounds[soundKey]}">
	                        <@spring.message code="message." + soundKey/>
	                </a>
	                <br/>
	                <a class="single-sound-link" href="/${soundKey?replace("_", "-")}" target="_blank">
	                        <@spring.message code="message.link"/>
	                </a>
	                <audio id="${soundKey}-button" preload="auto">  
							<source src="/static/sounds/${soundKey}.ogg" type="audio/ogg" />
							<source src="/static/sounds/${soundKey}.mp3" type="audio/mpeg" />
							<source src="/static/sounds/${soundKey}.wav" type="audio/wav" />  
							<@spring.message code="message.oldBrowser"/>
	                </audio>
                </li>
	        </#list>
        </ul>
	</div>

</@m.main>


