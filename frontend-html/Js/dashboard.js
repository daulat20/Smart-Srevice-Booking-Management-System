function loadRoles() {
    fetch("http://localhost:8080/api/role/getrole", {
        headers: {
            "Authorization": "Bearer " + localStorage.getItem("token")
        }
    })
    .then(res => res.json())
    .then(data => {
        const list = document.getElementById("list");
        list.innerHTML = "";
        data.forEach(role => {
            const li = document.createElement("li");
            li.textContent = role.name;
            list.appendChild(li);
        });
    });
}

function logout() {
    localStorage.removeItem("token");
    window.location.href = "login.html";
}
