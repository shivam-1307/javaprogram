cle

clear

disp("enter no of observation")

n=input(\')

disp("enter the vlaue of x")

for i=1:n

X(1,i)=input(\')

end

disp("enter no of frequency") for j=1:n

F(1.j)=input(1)

end

disp("Mean of the distribution is")

M=sum(F.*X)/sum(F)

disp(M)

for i=1:n

P(1,i)=sum(F)*exp(-M)*M^(X(i))/factorial(X(i))

end

disp("Expected frequencies are")

disp(P)

plot2d(X,P)
