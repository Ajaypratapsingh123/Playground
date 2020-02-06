college=input()
tution=int(input())
bus=int(input())
hostel=int(input())

if(college=='MSDS'):
    print(tution+bus)

if(college=='MSH'):
    print(tution+hostel)

if(college=='MGSDS'):
    print((tution*1.5)+bus)
    
if(college=='MGSH'):
    print((tution*1.5)+hostel)
      