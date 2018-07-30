<script type='text/javascript'>
	function notEmpty(elem){
		if(elem.value.length == 0){
			return false;
		}
		return true;
	}

	function isNumeric(elem){
		var numericExpression = /^[0-9]+$/;
		if(elem.value.match(numericExpression)){
			return true;
		} else {
			return false;
		}
	}

	function isAlphabet(elem){
        var alphaExp = /^[a-zA-Z0-9\u00A1-\uFFFF\_ .-@]+$/;
        if(elem.value.match(alphaExp)){
            return true;
        } else {
            return false;
        }
    }

    function isAlphanumeric(elem){
        var alphaExp = /^[a-zA-Z0-9\u00A1-\uFFFF\_ .-@]+$/;
        if(elem.value.match(alphaExp) && !isNumeric(elem)){
            return true;
        } else {
            return false;
        }
    }

	function isFloat(elem){
   		if(elem.value.indexOf(".") < 0){
     		return false;
   		} else {
      		if(parseFloat(elem.value)) {
              return true;
          	} else {
              return false;
          	}
   		}
	}

	function taskFormValidator() {
		var i=0;
		var myInputs = new Array();
					myInputs[i] = document.getElementById("ticketNr");
					i++;
					myInputs[i] = document.getElementById("applicationNr");
					i++;
					myInputs[i] = document.getElementById("getApplicationUrl");
					i++;
					myInputs[i] = document.getElementById("applicationString");
					i++;
					myInputs[i] = document.getElementById("groupCode");
					i++;
					myInputs[i] = document.getElementById("groupDescr");
					i++;
					myInputs[i] = document.getElementById("typeCode");
					i++;
					myInputs[i] = document.getElementById("typeDescr");
					i++;
					myInputs[i] = document.getElementById("actionNarrative");
					i++;
					myInputs[i] = document.getElementById("actionCode");
					i++;
					myInputs[i] = document.getElementById("slaInput");
					i++;
					myInputs[i] = document.getElementById("taskNarrative");
					i++;
					myInputs[i] = document.getElementById("taskCode");
					i++;
					myInputs[i] = document.getElementById("userCode");
					i++;
					myInputs[i] = document.getElementById("userDescr");
					i++;
					myInputs[i] = document.getElementById("taskNumber");
					i++;
					myInputs[i] = document.getElementById("DueDate");
					i++;
					myInputs[i] = document.getElementById("agentAppr");
					i++;
					myInputs[i] = document.getElementById("customerNr");
					i++;
					myInputs[i] = document.getElementById("verifyIdentity");
					i++;


		var j=0;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid ticketNr");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid applicationNr");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid getApplicationUrl");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid applicationString");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid groupCode");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid groupDescr");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid typeCode");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid typeDescr");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid actionNarrative");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid actionCode");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isNumeric(myInputs[j])) {
							alert("Please enter valid slaInput");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid taskNarrative");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid taskCode");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid userCode");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid userDescr");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid taskNumber");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid DueDate");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid agentAppr");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid customerNr");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid verifyIdentity");
							myInputs[j].focus();
							return false;
						}
					j++;

		return true;
	}
</script>
<style type="text/css">
	#container
	{
		margin: 0 auto;
		width: 600px;
		background:#fff;
	}

	#header
	{
		background: #ccc;
		padding: 20px;
		font-family:Arial, Helvetica, sans-serif;
		font-size: 125%;
		letter-spacing: -1px;
		font-weight: bold;
		line-height: 1.1;
		color:#666;
	}

	#header h1 { margin: 0; }

	#content
	{
		clear: left;
		padding: 20px;
	}

	#content h2
	{
		color: #000;
		font-size: 160%;
		margin: 0 0 .5em;
	}

	#footer
	{
		background: #ccc;
		text-align: right;
		padding: 20px;
		height: 1%;
	}

	fieldset {
		border:1px dashed #CCC;
		padding:10px;
		margin-top:20px;
		margin-bottom:20px;
	}
	legend {
		font-family:Arial, Helvetica, sans-serif;
		font-size: 90%;
		letter-spacing: -1px;
		font-weight: bold;
		line-height: 1.1;
		color:#fff;
		background: #666;
		border: 1px solid #333;
		padding: 2px 6px;
	}
	.form {
		margin:0;
		padding:0;
	}
	label {
		width:140px;
		height:32px;
		margin-top:3px;
		margin-right:2px;
		padding-top:11px;
		padding-left:6px;
		background-color:#CCCCCC;
		float:left;
		display: block;
		font-family:Arial, Helvetica, sans-serif;
		font-size: 115%;
		letter-spacing: -1px;
		font-weight: normal;
		line-height: 1.1;
		color:#666;
	}
	.div_texbox {
		width:347px;
		float:right;
		background-color:#E6E6E6;
		height:35px;
		margin-top:3px;
		padding-top:5px;
		padding-bottom:3px;
		padding-left:5px;
	}
	.div_checkbox {
		width:347px;
		float:right;
		background-color:#E6E6E6;
		height:35px;
		margin-top:3px;
		padding-top:5px;
		padding-bottom:3px;
		padding-left:5px;
	}
	.textbox {
		background-color:#FFFFFF;
		background-repeat: no-repeat;
		background-position:left;
		width:285px;
		font:normal 18px Arial;
		color: #999999;
		padding:3px 5px 3px 19px;
	}
	.checkbox {
		background-color:#FFFFFF;
		background-repeat: no-repeat;
		background-position:left;
		width:285px;
		font:normal 18px Arial;
		color: #999999;
		padding:3px 5px 3px 19px;
	}
	.textbox:focus, .textbox:hover {
		background-color:#F0FFE6;
	}
	.button_div {
		width:287px;
		float:right;
		background-color:#fff;
		border:1px solid #ccc;
		text-align:right;
		height:35px;
		margin-top:3px;
		padding:5px 32px 3px;
	}
	.buttons {
		background: #e3e3db;
		font-size:12px; 
		color: #989070; 
		padding: 6px 14px;
		border-width: 2px;
		border-style: solid;
		border-color: #fff #d8d8d0 #d8d8d0 #fff;
		text-decoration: none;
		text-transform:uppercase;
		font-weight:bold;
	}
</style>
<div id="container">
	<div id="header">
		New Process Instance: /OAO/src/main/resources/com/crossvale/oao.OAO
	</div>
	<div id="content">
	    <input type="hidden" name="processId" value="${process.id}"/>
		<fieldset>
            <legend>Process inputs</legend>
                            		<label for="name">ticketNr</label>
                            		<div class="div_texbox">
                              		<input name="ticketNr" type="text" class="textbox" id="ticketNr" value="" />
                            		</div>
              	
                            		<label for="name">applicationNr</label>
                            		<div class="div_texbox">
                              		<input name="applicationNr" type="text" class="textbox" id="applicationNr" value="" />
                            		</div>
              	
                            		<label for="name">getApplicationUrl</label>
                            		<div class="div_texbox">
                              		<input name="getApplicationUrl" type="text" class="textbox" id="getApplicationUrl" value="" />
                            		</div>
              	
                            		<label for="name">applicationString</label>
                            		<div class="div_texbox">
                              		<input name="applicationString" type="text" class="textbox" id="applicationString" value="" />
                            		</div>
              	
                            		<label for="name">groupCode</label>
                            		<div class="div_texbox">
                              		<input name="groupCode" type="text" class="textbox" id="groupCode" value="" />
                            		</div>
              	
                            		<label for="name">groupDescr</label>
                            		<div class="div_texbox">
                              		<input name="groupDescr" type="text" class="textbox" id="groupDescr" value="" />
                            		</div>
              	
                            		<label for="name">typeCode</label>
                            		<div class="div_texbox">
                              		<input name="typeCode" type="text" class="textbox" id="typeCode" value="" />
                            		</div>
              	
                            		<label for="name">typeDescr</label>
                            		<div class="div_texbox">
                              		<input name="typeDescr" type="text" class="textbox" id="typeDescr" value="" />
                            		</div>
              	
                            		<label for="name">actionNarrative</label>
                            		<div class="div_texbox">
                              		<input name="actionNarrative" type="text" class="textbox" id="actionNarrative" value="" />
                            		</div>
              	
                            		<label for="name">actionCode</label>
                            		<div class="div_texbox">
                              		<input name="actionCode" type="text" class="textbox" id="actionCode" value="" />
                            		</div>
              	
                            		<label for="name">slaInput</label>
                            		<div class="div_texbox">
                              		<input name="slaInput" type="text" class="textbox" id="slaInput" value="" />
                            		</div>
              	
                            		<label for="name">taskNarrative</label>
                            		<div class="div_texbox">
                              		<input name="taskNarrative" type="text" class="textbox" id="taskNarrative" value="" />
                            		</div>
              	
                            		<label for="name">taskCode</label>
                            		<div class="div_texbox">
                              		<input name="taskCode" type="text" class="textbox" id="taskCode" value="" />
                            		</div>
              	
                            		<label for="name">userCode</label>
                            		<div class="div_texbox">
                              		<input name="userCode" type="text" class="textbox" id="userCode" value="" />
                            		</div>
              	
                            		<label for="name">userDescr</label>
                            		<div class="div_texbox">
                              		<input name="userDescr" type="text" class="textbox" id="userDescr" value="" />
                            		</div>
              	
                            		<label for="name">taskNumber</label>
                            		<div class="div_texbox">
                              		<input name="taskNumber" type="text" class="textbox" id="taskNumber" value="" />
                            		</div>
              	
                            		<label for="name">DueDate</label>
                            		<div class="div_texbox">
                              		<input name="DueDate" type="text" class="textbox" id="DueDate" value="" />
                            		</div>
              	
                            		<label for="name">agentAppr</label>
                            		<div class="div_checkbox">
                              		<input name="agentAppr" type="checkbox" class="checkbox" id="agentAppr" value="true" />
                            		</div>
              	
                            		<label for="name">customerNr</label>
                            		<div class="div_texbox">
                              		<input name="customerNr" type="text" class="textbox" id="customerNr" value="" />
                            		</div>
              	
                            		<label for="name">verifyIdentity</label>
                            		<div class="div_checkbox">
                              		<input name="verifyIdentity" type="checkbox" class="checkbox" id="verifyIdentity" value="true" />
                            		</div>
              	

          </fieldset>
	</div>
	<div id="footer">
	</div>
</div>