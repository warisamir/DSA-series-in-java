class Solution:
    def isSameAfterReversals(self, num: int) -> bool:
        nm=str(num)
        a=nm[::-1]
        a1=int(a)
        b=str(a1)
        b1=b[::-1]
        if(nm==b1):
            return True
        else:
            return False