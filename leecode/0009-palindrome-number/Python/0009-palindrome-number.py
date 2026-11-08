class Solution(object):
    def isPalindrome(self, x):
        y=x
        copy=0
        while(x>0):
            d=x%10
            copy=copy*10+d
            x=x/10
        if y == copy:
            return True
        else:
            return False
        