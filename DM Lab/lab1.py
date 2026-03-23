price=[]
total=0.0
i=0
while(True):
    price.append(float(input("Enter price of item : ")))
    
    if(price[i]>0) :
        total=total+price[i]
    elif((price[i]<=0) and (total>1000)):
        print("Checkout complete")
        break
    i=i+1
print(" Total amount to be paid : ",total)


