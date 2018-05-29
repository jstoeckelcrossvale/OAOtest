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
					myInputs[i] = document.getElementById("agentAppr");
					i++;
					myInputs[i] = document.getElementById("appType");
					i++;
					myInputs[i] = document.getElementById("complApp");
					i++;
					myInputs[i] = document.getElementById("existingCust");
					i++;
					myInputs[i] = document.getElementById("verifiedID");
					i++;
					myInputs[i] = document.getElementById("p_DueDate");
					i++;
					myInputs[i] = document.getElementById("accountNBR");
					i++;
					myInputs[i] = document.getElementById("accountString");
					i++;
					myInputs[i] = document.getElementById("customerNumber");
					i++;
					myInputs[i] = document.getElementById("getCustomerURL");
					i++;
					myInputs[i] = document.getElementById("getCustomerResult");
					i++;
					myInputs[i] = document.getElementById("getAccountURL");
					i++;
					myInputs[i] = document.getElementById("accountNumber");
					i++;
					myInputs[i] = document.getElementById("customerString");
					i++;
					myInputs[i] = document.getElementById("getTicketURL");
					i++;
					myInputs[i] = document.getElementById("ticketNr");
					i++;
					myInputs[i] = document.getElementById("getTicketResult");
					i++;
					myInputs[i] = document.getElementById("actionString");
					i++;
					myInputs[i] = document.getElementById("taskString");
					i++;
					myInputs[i] = document.getElementById("taskNumber");
					i++;


		var j=0;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid agentAppr");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid appType");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid complApp");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid existingCust");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid verifiedID");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid p_DueDate");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isNumeric(myInputs[j])) {
							alert("Please enter valid accountNBR");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid accountString");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid customerNumber");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid getCustomerURL");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid getCustomerResult");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid getAccountURL");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid accountNumber");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid customerString");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid getTicketURL");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid ticketNr");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid getTicketResult");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid actionString");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid taskString");
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
                            		<label for="name">agentAppr</label>
                            		<div class="div_checkbox">
                              		<input name="agentAppr" type="checkbox" class="checkbox" id="agentAppr" value="true" />
                            		</div>
              	
                            		<label for="name">appType</label>
                            		<div class="div_texbox">
                              		<input name="appType" type="text" class="textbox" id="appType" value="" />
                            		</div>
              	
                            		<label for="name">complApp</label>
                            		<div class="div_checkbox">
                              		<input name="complApp" type="checkbox" class="checkbox" id="complApp" value="true" />
                            		</div>
              	
                            		<label for="name">existingCust</label>
                            		<div class="div_checkbox">
                              		<input name="existingCust" type="checkbox" class="checkbox" id="existingCust" value="true" />
                            		</div>
              	
                            		<label for="name">verifiedID</label>
                            		<div class="div_checkbox">
                              		<input name="verifiedID" type="checkbox" class="checkbox" id="verifiedID" value="true" />
                            		</div>
              	
                            		<label for="name">p_DueDate</label>
                            		<div class="div_texbox">
                              		<input name="p_DueDate" type="text" class="textbox" id="p_DueDate" value="" />
                            		</div>
              	
                            		<label for="name">accountNBR</label>
                            		<div class="div_texbox">
                              		<input name="accountNBR" type="text" class="textbox" id="accountNBR" value="" />
                            		</div>
              	
                            		<label for="name">accountString</label>
                            		<div class="div_texbox">
                              		<input name="accountString" type="text" class="textbox" id="accountString" value="" />
                            		</div>
              	
                            		<label for="name">customerNumber</label>
                            		<div class="div_texbox">
                              		<input name="customerNumber" type="text" class="textbox" id="customerNumber" value="" />
                            		</div>
              	
                            		<label for="name">getCustomerURL</label>
                            		<div class="div_texbox">
                              		<input name="getCustomerURL" type="text" class="textbox" id="getCustomerURL" value="" />
                            		</div>
              	
                            		<label for="name">getCustomerResult</label>
                            		<div class="div_texbox">
                              		<input name="getCustomerResult" type="text" class="textbox" id="getCustomerResult" value="" />
                            		</div>
              	
                            		<label for="name">getAccountURL</label>
                            		<div class="div_texbox">
                              		<input name="getAccountURL" type="text" class="textbox" id="getAccountURL" value="" />
                            		</div>
              	
                            		<label for="name">accountNumber</label>
                            		<div class="div_texbox">
                              		<input name="accountNumber" type="text" class="textbox" id="accountNumber" value="" />
                            		</div>
              	
                            		<label for="name">customerString</label>
                            		<div class="div_texbox">
                              		<input name="customerString" type="text" class="textbox" id="customerString" value="" />
                            		</div>
              	
                            		<label for="name">getTicketURL</label>
                            		<div class="div_texbox">
                              		<input name="getTicketURL" type="text" class="textbox" id="getTicketURL" value="" />
                            		</div>
              	
                            		<label for="name">ticketNr</label>
                            		<div class="div_texbox">
                              		<input name="ticketNr" type="text" class="textbox" id="ticketNr" value="" />
                            		</div>
              	
                            		<label for="name">getTicketResult</label>
                            		<div class="div_texbox">
                              		<input name="getTicketResult" type="text" class="textbox" id="getTicketResult" value="" />
                            		</div>
              	
                            		<label for="name">actionString</label>
                            		<div class="div_texbox">
                              		<input name="actionString" type="text" class="textbox" id="actionString" value="" />
                            		</div>
              	
                            		<label for="name">taskString</label>
                            		<div class="div_texbox">
                              		<input name="taskString" type="text" class="textbox" id="taskString" value="" />
                            		</div>
              	
                            		<label for="name">taskNumber</label>
                            		<div class="div_texbox">
                              		<input name="taskNumber" type="text" class="textbox" id="taskNumber" value="" />
                            		</div>
              	

          </fieldset>
	</div>
	<div id="footer">
	</div>
</div>