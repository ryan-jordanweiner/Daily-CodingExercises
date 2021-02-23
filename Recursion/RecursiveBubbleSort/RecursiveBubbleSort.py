def recursiveBubbleSort(arr, n):
    #base case (checks to see if the array is sorted using an iterative function defined by isSorted below
    if (isSorted(arr)):
        return arr
    
    #resets the n (value of the index being used to compare) to 0 if it has reached its end point (length of the array-2)
    if n > len(arr)-2:
        n = 0
        
    #swaps array[n] and array[n+1] if they are out of order (ie arr[n] > arr[n+1]
    if arr[n] > arr[n+1]:
        arr[n+1], arr[n] = arr[n], arr[n+1]
    
    #returns the modified array with a new n value to continue
    return recursiveBubbleSort(arr, n+1)

#used to simplify usage
#only input the array, let the system add the starting index for you
def beginRecursiveSort(arr):
    return recursiveBubbleSort(arr, 0)



#iterates over the array to check if it is sorted
def isSorted(arr):
    for i in range(1, len(arr)-1):
        if arr[i-1] > arr[i]:
            return False
    return True

#define testing array
testArr = [1, 6, 67, 23, 3, 5, 10, 11]
#print results of the sorting algorithm
print(beginRecursiveSort(testArr))

