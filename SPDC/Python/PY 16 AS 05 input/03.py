"""3. Write a python script to calculate simple interest. Needful data should be taken from user."""
print("Calculate Simple Interest: ");
p = int(input("Enter Principal of Amount: "));
r = float(input("Enter annual rate of interest: "));
t = int(input("Enter time(in years): "));
SI = str((p*r*t)/100);
print("Simple Interest is: "+SI);