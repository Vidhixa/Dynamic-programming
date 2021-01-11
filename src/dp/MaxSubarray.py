# Kadane's algo for max subarray
# Hint: local_maximum at index i is the maximum of A[i] and the sum of A[i] and local_maximum at index i-1.
#i.e. localMax(i) = max(A[i], A[i]+localMax(i-1))
def maxSubArray(q): 
    # 1 3 -2 4 0 -1
    # max sum: 6; elements: 1 3 -2 4 0
    localMax = 0
    globalMax = -11111111 # Max neg infinity
    
    for i in range(len(q)):
        localMax = max(q[i], q[i]+localMax) # Resets local max
        if localMax > globalMax:
            globalMax = localMax
        
    print str(globalMax)
