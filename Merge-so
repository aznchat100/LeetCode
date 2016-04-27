number = [5,2,6,12,8,1,10]


def mergesort(alist):
	if len(alist) <= 1:
		return alist

	mid = len(alist)/2
	left = mergesort(alist[:mid])
	right = mergesort(alist[mid:])
	print left,right
	return merge(left, right)
		
def merge(left,right):
	if not left:
		return right
	if not right:
		return left
	if left[0] < right[0]:
		return [left[0]] + merge(left[1:],right)
	if right[0] < left[0]:
		return [right[0]] + merge(left,right[1:]) 

print mergesort(number)
