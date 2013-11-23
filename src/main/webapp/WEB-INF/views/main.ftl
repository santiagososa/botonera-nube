<#import "/spring.ftl" as spring/>
<#import "util/main-template.ftl" as m>

<@m.main>

	<div class="row">
		<ul class="small-block-grid-2 large-block-grid-4">
	        <#assign i = 0>
	        <#list sounds as sound>
	        	<li class="centered-content">
	                <a href="#" id="${sound}" class="button color-${i % 8} round">
	                        <@spring.message code="message." + sound/>
	                </a>
	                <br/>
	                <a class="single-sound-link" href="/${sound?replace("_", "-")}" target="_blank">
	                        <@spring.message code="message.link"/>
	                </a>
	                <audio id="${sound}-button" preload="auto">  
							<source src="/static/sounds/${sound}.ogg" type="audio/ogg" />
							<source src="/static/sounds/${sound}.mp3" type="audio/mpeg" />
							<source src="/static/sounds/${sound}.wav" type="audio/wav" />  
							<@spring.message code="message.oldBrowser"/>
	                </audio>
                </li>
                <#assign i = i + 1>
	        </#list>
        </ul>
	</div>

</@m.main>
