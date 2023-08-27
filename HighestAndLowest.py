#In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
#https://www.codewars.com/kata/554b4ac871d6813a03000035
#Examples
#high_and_low("1 2 3 4 5")  # return "5 1"
#high_and_low("1 2 -3 4 5") # return "5 -3"
#high_and_low("1 9 3 4 -5") # return "9 -5"

def high_and_low(numbers):
    numberSeparate = numbers.split(" ")
    numberInt = list(map(int, numberSeparate))
    biggest=numberInt[0]
    lowest=numberInt[0]
    for n in numberInt:
        if(n>biggest):
            biggest=n
            print("the biggest is "+str(biggest))
        if(n<lowest):
            lowest=n
            print("the lowest is "+str(lowest))
    
    results=str(biggest)+" "+str(lowest)
    return results