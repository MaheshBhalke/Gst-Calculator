	function openMenu() {
		document.getElementById("menuSidebar").style.width = "250px";
		document.getElementById("bt-menu").style.marginLeft = "0px";
		document.getElementById("menuSidebar").style.marginTop = "80px";
		document.getElementById("containder").style.marginLeft = "270px";
	}

	function closeMenu() {
		document.getElementById("menuSidebar").style.width = "0";
		document.getElementById("bt-menu").style.marginLeft = "0";
		document.getElementById("containder").style.marginLeft = "30px";
	}
	  
        var content_data = document.getElementById("tab-content");  
              
        document.getElementById('tab-1').onclick = tab_click; 
        document.getElementById('tab-2').onclick = tab_click; 
          
              
        function tab_click(clicked) { 
        content_data.innerHTML = "Selected Button id = "+ this.id; 
        }  
	    


