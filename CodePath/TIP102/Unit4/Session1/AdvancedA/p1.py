#Understand:
    #Input - List of dictionaries (brands) and a string (criterion)
    #Output - list of strings representing the brands that meet the criteria
#Plan: 
    #return list var
    #Iterate through the brands list:
        #if criterion in brands['criteria']:
            #list.append(brand['name'])
    #return list
#Time/Space Complexity: 
    #Time - O(n * m)
    #space - O(n)

#Implement: 
def filter_sustainable_brands(brands, criterion):
    filtered = []

    for brand in brands:
        if criterion in brand['criteria']:
            filtered.append(brand['name'])

    return filtered

brands = [
    {"name": "EcoWear", "criteria": ["eco-friendly", "ethical labor"]},
    {"name": "FastFashion", "criteria": ["cheap materials", "fast production"]},
    {"name": "GreenThreads", "criteria": ["eco-friendly", "carbon-neutral"]},
    {"name": "TrendyStyle", "criteria": ["trendy designs"]}
]

brands_2 = [
    {"name": "Earthly", "criteria": ["ethical labor", "fair wages"]},
    {"name": "FastStyle", "criteria": ["mass production"]},
    {"name": "NatureWear", "criteria": ["eco-friendly"]},
    {"name": "GreenFit", "criteria": ["recycled materials", "eco-friendly"]}
]

brands_3 = [
    {"name": "OrganicThreads", "criteria": ["organic cotton", "fair trade"]},
    {"name": "GreenLife", "criteria": ["recycled materials", "carbon-neutral"]},
    {"name": "FastCloth", "criteria": ["cheap production"]}
]

print(filter_sustainable_brands(brands, "eco-friendly"))
print(filter_sustainable_brands(brands_2, "ethical labor"))
print(filter_sustainable_brands(brands_3, "carbon-neutral"))
