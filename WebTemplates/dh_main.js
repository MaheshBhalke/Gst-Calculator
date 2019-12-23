	function openMenu() {
		document.getElementById("menuSidebar").style.width = "250px";
		document.getElementById("bt-menu").style.marginLeft = "0px";
		document.getElementById("menuSidebar").style.marginTop = "80px";
		document.getElementById("maindiv").style.marginLeft = "270px";
	}

	function closeMenu() {
		document.getElementById("menuSidebar").style.width = "0";
		document.getElementById("bt-menu").style.marginLeft = "0";
		document.getElementById("maindiv").style.marginLeft = "30px";
	}
	
	$(document).ready(function() {
		$("#defaultOpen").click(function() {
			
		});

		$("#defaultOpen1").click(function() {
			
		});
	});
	
	function openLink1(evt, cityName) {
		var i, tabcontent, tablinks;
		tabcontent = document.getElementsByClassName("tabcontent");
		for (i = 0; i < tabcontent.length; i++) {
			tabcontent[i].style.display = "none";
		}
		tablinks = document.getElementsByClassName("tablinks");
		for (i = 0; i < tablinks.length; i++) {
			tablinks[i].className = tablinks[i].className
					.replace(" active", "");
		}
		document.getElementById(cityName).style.display = "block";
		evt.currentTarget.className += " active";
	}

	// Get the element with id="defaultOpen" and click on it
	document.getElementById("defaultOpen").click();
	document.getElementById("defaultOpen1").click();
	document.getElementById("defaultOpen2").click();
