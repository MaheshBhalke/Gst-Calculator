function openNav() {
		document.getElementById("mySidebar").style.width = "250px";
		document.getElementById("main").style.marginLeft = "0px";
		document.getElementById("mySidebar").style.marginTop = "80px";
		document.getElementById("body").style.marginLeft = "270px";
	}

	function closeNav() {
		document.getElementById("mySidebar").style.width = "0";
		document.getElementById("main").style.marginLeft = "0";
		document.getElementById("body").style.marginLeft = "30px";
	}
	
	$(document).ready(function() {
		$("#defaultOpen").click(function() {
			$.ajax({
				url : "http://localhost:8080/api/typeadded",
				success : function(data) {
					$("#London").empty().append(JSON.stringify(data))
				}
			});
		});

		$("#defaultOpen1").click(function() {
			$.ajax({
				url : "http://localhost:8080/api/gst/3/12000",
				success : function(data) {
					$("#Paris").empty().append(JSON.stringify(data))
				}
			});
		});
	});
	
	function openCity(evt, cityName) {
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