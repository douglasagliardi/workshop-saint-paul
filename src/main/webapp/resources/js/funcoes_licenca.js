/**
 * Funções js lista de cursos
 */

function showHideDtExp(){
	
	var resposta = document.getElementById("tipoLicenca").value;
	
	//Verifica se for contínuo e oculta a linha
	if(resposta == "3"){
		document.getElementById("trDataExp").style.display = 'none';
	}
}

function initLicenca(){
	
	//Verifica show/hide data expiração
	showHideDtExp();
	
}

function trocaCssPageTitle(){
	//Para trocar a cor do cabeçario do conteúdo da página
	var x = document.getElementById('pageTitleDiv');
    x.style.background = "#ffa500";
}

function hideShowData(){
	
	var tipo = document.getElementById("tipo").value
	
	if(tipo == 3){
		document.getElementById("trDtPic").style.display = 'none';
		
	} else {
		document.getElementById("trDtPic").style.display = '';
	}	
}
