function reverse(value){
    var word=value.split(' ');
    var reverse=word.map(function(word){
        return word.split('').reverse().join('');
    });
    var reverseWord=reverse.join(' ');
    return reverseWord;
    }
    var input="This is a Sunny Day";
    var reversedSentence=reverse(input);
    console.log(reversedSentence);
