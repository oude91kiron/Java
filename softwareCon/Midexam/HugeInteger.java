/*
Create a class HugeInteger which uses a 40-element array of digits to store integers as large as 40 digits each.
Provide methods
a)	Input, [10 Points]
b)	ToString,[5 Points]
c)	Add [20 Points]
For comparing HugeInteger objects, provide the following methods:
a)	IsEqualTo, [10 Points]
b)	IsNotEqualTo, [5 Points]
c)	IsGreaterThan, [10 Points]
d)	IsLessThan, [10 Points]
e)	IsGreaterthanOrEqualTo [5 Points]
f)	IsLessThanOrEqualTo [5 Points]
Each of these is a method that returns true if the relationship holds between the two HugeInteger objects and returns false if the relationship does not hold.

	In the Input method, use the string method ToCharArray to convert the input string into an array of characters, then iterate through these characters to create your HugeInteger.

toCharArray method
	public char[] toCharArray()
	Return : It returns a newly allocated character array.
	String s = "construction";
	char[] str = s.toCharArray();

The following piece of code converts character 1 to integer 1
	char c=’1’;
	int intc=Character.getNumericValue((int)c));

*/

public class HugeInteger{
private static final int integerLimit = 40;
private int[] hugeInteger = new int[integerLimit];
private int length;

//---------------------------------------------------------
private void input(String mainString){

    char[] carArray = mainString.toCharArray();

length = (carArray.length > hugeInteger.length) ?
hugeInteger.length : carArray.length;

// add to array

for(int i=integerLimit - length; i<integerLimit; i++){
    int j = 0;
hugeInteger[i] = Character.getNumericValue((int)carArray[j]);
	j++;
}
}

//---------------------------------------------------------
private String ToString(){
String HI_as_Str = "";

for(int i=integerLimit - length; i<integerLimit; i++){
HI_as_Str += hugeInteger[i];
}

return HI_as_Str;
}
//-------------------------------------------------------------------------------------
// addition
public static HugeInteger add(HugeInteger huge1, HugeInteger huge2){
int[] tmp1 = huge1.getHugeInteger();
int[] tmp2 = huge2.getHugeInteger();

String strTmp = "";

int count = (huge1.getLength() > huge2.getLength()) ?
huge1.getLength() : huge2.getLength();

for(int i=integerLimit - count; i<integerLimit; i++){
strTmp += tmp1[i] + tmp2[i];
}
return new HugeInteger(strTmp);
}

//-------------------------------------------------------------------------------------
// isEqualTo
public static boolean isEqualTo(HugeInteger huge1, HugeInteger huge2){
int[] tmp1 = huge1.getHugeInteger();
int[] tmp2 = huge2.getHugeInteger();

for(int i=0; i<integerLimit; i++){
if(tmp1[i] != tmp2[i])
return false;
}
return true;
}
// isNotEqualTo----------------------------------------------------------------------------
public static boolean isNotEqualTo(HugeInteger huge1, HugeInteger huge2){
if(isEqualTo(huge1, huge2)){
return false;
}else{
return true;
}
}
//-------------------------------------------------------------------------------------
// isGreaterThan
public static boolean isGreaterThan(HugeInteger huge1, HugeInteger huge2){

for (int i = 0; i<length; ++i){
    int huge1Sum += huge1[i];
    int huge2Sum += huge2[i];
}
if( huge1Sum == huge2Sum){
    return false;
}
else if(huge1Sum < huge2Sum){
    return false;
}
else{
    return true;
}
}
//-------------------------------------------------------------------------------------
// isLessThan
public static boolean isLessThan(HugeInteger huge1, HugeInteger huge2){
    // check if they are equal
    if(isEqualTo(huge1, huge2))
    {
        return false;
    }
    else if(isGreaterThan(huge1, huge2))
    {
        return false;
    }
    else
    {
        return true;
    }
}
//-------------------------------------------------------------------------------------
// isGreaterThanOrEqualTo
public static boolean isGreaterThanOrEqualTo(HugeInteger huge1, HugeInteger huge2){
if(isGreaterThan(huge1, huge2) || isEqualTo(huge1, huge2))
return true;

return false;
}
//-------------------------------------------------------------------------------------
// isLessThanOrEqualTo
public static boolean isLessThanOrEqualTo(HugeInteger huge1, HugeInteger huge2){
if(isLessThan(huge1, huge2) || isEqualTo(huge1, huge2))
return true;

return false;
}
}
