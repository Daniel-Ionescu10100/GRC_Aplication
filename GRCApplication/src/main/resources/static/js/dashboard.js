function toggleDropdown() {
    document.getElementById("riskDropdown").classList.toggle("show");
}

function toggleConfigOptions() {
    // Show config section
    const configSection = document.getElementById("config-options");
    const riskForm = document.getElementById("plan-risk-form");

    // Toggle config, but always hide risk form
    const isVisible = configSection.classList.contains("show-section");

    // Reset both first
    configSection.classList.remove("show-section");
    riskForm.style.display = "none";

    if (!isVisible) {
        configSection.classList.add("show-section");
    }
}

function showPlanRiskForm() {
    const riskForm = document.getElementById("plan-risk-form");
    const configSection = document.getElementById("config-options");

    // Toggle risk form, but always hide config
    const isVisible = riskForm.style.display === "block";

    // Reset both first
    configSection.classList.remove("show-section");
    riskForm.style.display = "none";

    if (!isVisible) {
        riskForm.style.display = "block";
    }
}

// Close dropdowns when clicking outside
window.onclick = function (event) {
    if (!event.target.matches('.dropbtn')) {
        const dropdowns = document.getElementsByClassName("dropdown-content");
        for (let i = 0; i < dropdowns.length; i++) {
            dropdowns[i].classList.remove('show');
        }
    }
};

function validateRange(input) {
    const value = parseInt(input.value, 10);
    if (value < 1) input.value = 1;
    if (value > 5) input.value = 5;
}

