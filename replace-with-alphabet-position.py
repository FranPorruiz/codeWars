#In this kata you are required to, given a string, replace every letter with its position in the alphabet.
#If anything in the text isn't a letter, ignore it and don't return it.
def alphabet_position(text):
    alphabet="abcdefghijklmnopqrstuvwxyz"
    #To make the comparison easyies, I take the input and transform it to low cap
    text_lower=text.lower()
    #Arrays to return
    numbers_position=""
    #this double loop compares the input with the alphabet
    for x in text_lower:
        for y in alphabet:
            if y == x:
                #with this if we erase other signs
                if alphabet.index(y)!=-1:
                    numbers_position=numbers_position+(str((alphabet.index(y)+1))+" ")
    
    #this line of code erase the las empty space
    numbers_position= numbers_position[:-1]

    return numbers_position
    pass

