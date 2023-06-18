import pandas as pd
import mysql.connector

# Read CSV into a pandas DataFrame
df = pd.read_csv('src/main/java/com/example/application/views/main/movies.csv')

# Establish a connection to the MySQL database
connection = mysql.connector.connect(
    host='localhost',
    user='root',
    password='gotCompany@01',
    database='petrabyte_one'
)

# Create a cursor object to execute SQL queries
cursor = connection.cursor()


# In[7]:


# Create the table if it doesn't exist
table_query = '''
CREATE TABLE IF NOT EXISTS movies (
    Film VARCHAR(100),
    Genre VARCHAR(100),
    Lead_Studio VARCHAR(100),
    Audience_Score INT,
    Profitability FLOAT,
    Rotten_Tomatoes INT,
    Worldwide_Gross VARCHAR(100),
    Year INT
)
'''
cursor.execute(table_query)

# Insert data into the table
insert_query = '''
INSERT INTO movies (Film, Genre, Lead_Studio, Audience_Score, Profitability, Rotten_Tomatoes, Worldwide_Gross, Year)
VALUES (%s, %s, %s, %s, %s, %s, %s, %s)
'''

for _, row in df.iterrows():
    film = row['Film']
    genre = row['Genre']
    lead_studio = row['Lead Studio']
    audience_score = row['Audience score %']
    profitability = row['Profitability']
    rotten_tomatoes = row['Rotten Tomatoes %']
    worldwide_gross = row['Worldwide Gross']
    year = row['Year']

    # Execute the INSERT query with the data
    cursor.execute(insert_query, (film, genre, lead_studio, audience_score, profitability, rotten_tomatoes, worldwide_gross, year))

# Commit the changes to the database
connection.commit()

# Close the cursor and connection
cursor.close()
connection.close()

print("Python script executed successfully in python_script")


# In[ ]:




