function verificaEmail() {
	if (document.forms[0].email.value == ""
			|| document.forms[0].email.value.indexOf('@') == -1
			|| document.forms[0].email.value.indexOf('.') == -1) {
		document.forms[0].email.value = "";
		alert("Por favor, informe um E-MAIL válido!");

		return false;
	}
	return true;
}

function checarEmail() {
	if (document.forms[0].email.value == ""
			|| document.forms[0].email.value.indexOf('@') == -1
			|| document.forms[0].email.value.indexOf('.') == -1) {
		document.forms[0].email.value = "";
		alert("Por favor, informe um E-MAIL válido!");
		return false;
	}
}

function mascara(o, f) {
	v_obj = o
	v_fun = f
	setTimeout("execmascara()", 1)
}
function execmascara() {
	v_obj.value = v_fun(v_obj.value)
}
function mtel(v) {
	v = v.replace(/\D/g, ""); 
	v = v.replace(/^(\d{2})(\d)/g, "($1) $2");
												
	v = v.replace(/(\d)(\d{4})$/, "$1-$2"); 
											
	return v;
}
