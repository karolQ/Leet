Array type of Leet code.

- 283. Move Zeroes
	Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
	For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

- 238. Product of Array Except Self
  Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
  Solve it without division and in O(n).
  For example, given [1,2,3,4], return [24,12,8,6].

  Thoughts:
  1. (myself) counting zeroes in the array, and 3 cases:
    i. 0 zero: multiplicity of all numbers but itself;
    ii. 1 zero: the result of the zero one is multiplicity of all numbers except 0, other positions are all zero;
    iii. 2 or more zeroes: all the results should be zero.

  2. Polygenelubricants (hard to understand but without considering division problems and efficient)
    src: http://blog.csdn.net/Ponnim_CS_DN/article/details/39483611, and http://stackoverflow.com/questions/2680548/given-an-array-of-numbers-return-array-of-products-of-all-other-numbers-no-div

    An explanation of polygenelubricants method is: The trick is to construct the arrays (in the case for 4 elements)

    {        1,             a[0],   a[0]* a[1],   a[0]* a[1]* a[2],}
    { a[1]* a[2]* a[3],  a[2]* a[3],   a[3],               1,  }
    Both of which can be done in O(n) by starting at the left and right edges respectively.

    Then multiplying the two arrays element by element gives the required result

    Code would look something like this:

    int a[N] // This is the input
    int products_below[N];
    p=1;
    for(int i=0;i<N;++i) {
      products_below[i]=p;
      p*=a[i];
    }

    int products_above[N];
    p=1;
    for(int i=N-1;i>=0;--i) {
        products_above[i]=p;
        p*=a[i];
    }     

    int products[N]; // This is the result
    for(int i=0;i<N;++i) {
      products[i]=products_below[i]* products_above[i];
}   
    If you need to be O(1) in space too you can do this (which is less clear IMHO)

    int a[N] // This is the input
    int products[N];

    // Get the products below the current index
    p=1;
    for(int i=0;i<N;++i) {
      products[i]=p;
      p*=a[i];
    }   

    // Get the products above the curent index
    p=1;
    for(int i=N-1;i>=0;--i) {
      products[i]*=p;
      p*=a[i];
    }   

- 122. Best Time to Buy and Sell Stock II
  Say you have an array for which the ith element is the price of a given stock on day i.

  Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).

- 
