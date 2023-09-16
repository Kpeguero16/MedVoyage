const diagnosis = {
    question: " Are you experiencing flu-like symptoms? ",
    yes: {
        question: " Are you experiencing hallucinations? ",
        yes: {
            question: " Does your throat burn when you drink water? ",
            yes: {
                // Rabies
            },
            no: {
                // Seek medical help
            }
        },
        no: {
            question: " Do you inflated buboes? ",
            yes: {
                // Plague
            },
            no: {
                question: " Do you have gastrointestinal issues? ",
                yes: {
                    question: " Bleeding? ",
                    yes: {
                        // Ebola 
                    },
                    no: {
                        //seek medical assistance
                    }
                },
                no: {
                    // Seek medical help
                }
            }
        }
    },
    no: {

    }
};

const yesButton = document.getElementById("yes");
const noButton = document.getElementById("no");

function update(answer){
    
}

