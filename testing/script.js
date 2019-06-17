function ShowResult() {
    // clean error
    CleanError();
    // get info student
    var studentName = document.getElementById("name").value;
    var gender = document.querySelector('input[name=gender]:checked').value;
    var dateTime = document.getElementById("datebirthday").value;
    var score1 = parseFloat(document.getElementById("score1").value);
    var score2 = parseFloat(document.getElementById("score2").value);
    var score3 = parseFloat(document.getElementById("score3").value);
    var score4 = parseFloat(document.getElementById("score4").value);

    var inputScore = [score1, score2, score3, score4];
    // validate number

    var validScore = ValidScore(inputScore);

    if(validScore.length > 0) {
        for(var i in validScore){
            document.getElementById("score" + validScore[i] + "Error").innerHTML = "Chỉ được nhập số";
        }
    }
    else {
        // set modal bootstrap
        document.getElementById("name_student").innerHTML = studentName;
        document.getElementById("gender_student").innerHTML = gender;
        document.getElementById("birthday_student").innerHTML = dateTime;

        // avg score
        var avgScore = AvgScore(score1,score2,score3,score4);
        document.getElementById("score_student").innerHTML = avgScore;

        // rank
        var rank = Rank(avgScore);
        document.getElementById("rank_student").innerHTML = rank;

        $('#result').modal('show');
    }   
}


// cale avg score

function AvgScore(s1,s2,s3,s4) {
    var avg = (s1+s2+s3+s4) / 4
    return avg;
}


function Rank(avg) {
    if( avg <= 10 && avg >8 ) {
        return "Học lực giỏi";
    }
    else if (avg <= 8 && avg > 5) {
        return "Học lực khá";
    }
    else{
        return "Học lực kém";
    }
}

// function validate is number

function Validate(input) {
    if(input.toString() === "NaN") {
        return false;
    }
    else {
        return true;
    }
}

function ValidScore(inputScore){
    var index = [];
    for(var i = 0 ; i < inputScore.length; i++){
        if(!Validate(inputScore[i])){
            index.push(i);
        }
    }
    return index;
}


function CleanError() {
    for(var i = 0 ; i< 4 ; i++){
        document.getElementById("score" + i + "Error").innerHTML = "";
    }
}