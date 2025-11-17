from collections import Counter

def solution(array):
    freq = Counter(array) 
    max_value = max(freq.values())
    
    modes = []
    for k, v in freq.items():
        if v == max_value:
            modes.append(k)
    
    if len(modes) > 1:
        return -1
    return modes[0]