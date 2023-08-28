#You are going to be given a word. 
#Your job is to return the middle character of the word.
# If the word's length is odd, return the middle character. 
#If the word's length is even, return the middle 2 characters.
#https://www.codewars.com/kata/56747fd5cb988479af000028

def get_middle(string):
    
    middle=int((len(string))/2)
    
    if (len(string)%2)==0:
        return string[middle-1]+string[middle]
    else:
        return string[middle] 
    pass