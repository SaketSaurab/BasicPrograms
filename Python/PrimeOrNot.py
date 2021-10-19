a=2
check=0
number=int(input("Enter a number: "))
if number<=1:
    check=1

    while(a<=number/2):
     if number%a==0:
            check=1
            break
    else:
             a+=1
if check==0:print(number," is prime number")
else:print(number," is not prime number")