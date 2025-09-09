#Understand:
    #Input - List of tuples(scene_records) where the first element is a date string and the second element is a scene string
    #Output - Return list sorted by date
#Match: sort using sort() method
#Plan:
    #scene_records.sort(key = lambda record:record[0])
    #return scene_records
#Implement:
def organize_scene_data_by_date(scene_records):
    scene_records.sort(key = lambda record: record[0])
    return scene_records

#Evaluate:
    #Time Complexity - O(n log n)
    #Space Complexity - O(1)

scene_records = [
    ("2024-08-15", "Climax"),
    ("2024-08-10", "Introduction"),
    ("2024-08-20", "Resolution"),
    ("2024-08-12", "Rising Action")
]
print(organize_scene_data_by_date(scene_records))

scene_records = [
    ("2023-07-05", "Opening"),
    ("2023-07-07", "Conflict"),
    ("2023-07-01", "Setup"),
    ("2023-07-10", "Climax")
]
print(organize_scene_data_by_date(scene_records))
