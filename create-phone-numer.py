#Write a function that accepts an array of 10 integers (between 0 and 9), 
#that returns a string of those numbers in the form of a phone number.

#My solution
def create_phone_number(n):
    phoneNumber="("+str(n[0])+str(n[1])+str(n[2])+")"+" "+str(n[3])+str(n[4])+str(n[5])+"-"+str(n[6])+str(n[7])+str(n[8])+str(n[9])
    return phoneNumber 