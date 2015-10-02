var req;
var isIE;
var field;
var suggestions;

function init(){
	field = document.getElementById("completion-field");
	suggestions = document.getElementById("suggestions");
}

function doCompletion() {
	init();
    var url = "../AutoComplete?action=complete&keyword=" + escape(field.value);
    req = initRequest();
    req.open("GET", url, true);
    req.onreadystatechange = callback;
    req.send(null);
}

function initRequest() {
	
    if (window.XMLHttpRequest) {
        if (navigator.userAgent.indexOf('MSIE') != -1) {
            isIE = true;
        }
        return new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        isIE = true;
        return new ActiveXObject("Microsoft.XMLHTTP");
    }
}

function callback() {
    clearTable();

    if (req.readyState == 4) {
        if (req.status == 200) {
            parseMessages(req.responseXML);
        }
    }
}

function appendItem(id,name,artist) {
	
    suggestions.style.display = 'block';
	var html = "<a href='item.jsp?pos="+ id +"'><div class='sug-item'><div class='sug-name'>" + name + "</div><div class='sug-artist'>" + artist + "</div></div></a>";
	suggestions.innerHTML += html;
   
}

function clearTable() {
    if (suggestions.getElementsByTagName("a").length > 0) {
        suggestions.style.display = 'none';
        for (i = suggestions.childNodes.length -1; i >= 0 ; i--) {
            suggestions.removeChild(suggestions.childNodes[i]);
        }
    }
}



function parseMessages(responseXML) {
    
    // no matches returned
    if (responseXML == null) {
        return false;
    } else {

        var items = responseXML.getElementsByTagName("items")[0];

        if (items.childNodes.length > 0) {
            for (i = 0; i < items.childNodes.length; i++) {
                var item = items.childNodes[i];
                var idxml = item.getElementsByTagName("hashID")[0];
                var namexml = item.getElementsByTagName("hashName")[0];
                var artxml = item.getElementsByTagName("hashArtist")[0];
				
                appendItem(idxml.childNodes[0].nodeValue,
                    namexml.childNodes[0].nodeValue,
                    artxml.childNodes[0].nodeValue);
            }
        }
    }
}

