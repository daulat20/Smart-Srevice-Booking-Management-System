function register() {
    fetch("http://localhost:8080/api/users/register", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            firstname: firstname.value,
            lastname: lastname.value,
            email: email.value,
            password: password.value,
            contact: contact.value
        })
    })
    .then(res => res.json())
    .then(() => {
        alert("Registration successful!");
        window.location.href = "login.html";
    })
    .catch(() => alert("Registration failed"));
}
