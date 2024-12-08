import matplotlib.pyplot as plt



print("coucou")



L1= [5321,3524,10289,9654,20551,23835,44165,57117,96703,133602,214092,302384]
L2=[ 5323,4014 ,11365 ,10561 , 23622 , 26528 , 49864 , 63317 , 107522 ,146032  , 236365, 331049 ]
L3=[ 5505,3485 ,10455 ,10013 , 21832 , 24872 , 46010 , 56986 , 96911 ,134592  , 216080, 306359 ]
L4=[ 5156,3397 ,9824 ,9372 , 20052 , 23892 , 42972 , 56208 , 91882 ,130219  , 202626, 293747 ]
L5=[ 5078,3486 ,9585 ,8914 , 19465 , 22371 , 42910 , 54709 , 92216 ,125094  , 203282, 286929 ]
T=[i for i in range(12)]

labels = ["L1","L2","L3","L4","L5"]
plt.plot(T,L1)
plt.plot(T,L2)
plt.plot(T,L3)
plt.plot(T,L4)
plt.plot(T,L5)
plt.xlabel("année")
plt.ylabel("population de lapines")
plt.legend(labels)
plt.title("Simulation pour 1000 lapines en capacité de ce reproduire en les tuants au début de l'année")
plt.show()



T1= [4514,2635,7787,6956,14273,15490, 26650, 32458,51654,65593,98875,130814]
T2=[  4891, 3341, 8689, 7956,14840, 16397,29097, 34673, 55032,71175, 106567, 142583]
T3=[ 4891, 3341, 8689,7956, 14840, 16397,29097,34673,55032,71175,106567,142583]
T4=[ 4992, 3058,8613, 7802,16509, 17427,31293,37224, 59905, 76235,115166, 155149]
T5=[4800,2843,8454, 6910,15501,15374,29510, 33177, 53986,67399,107321,138636]


plt.plot(T,T1)
plt.plot(T,T2)
plt.plot(T,T3)
plt.plot(T,T4)
plt.plot(T,T5)
labels2 = ("T1","T2","T3","T4","T5")
plt.legend(labels2)

plt.xlabel("année")
plt.ylabel("population de lapines")
plt.title("Simulation pour 1000 lapines en capacité de ce reproduire en les tuants au début et après les accouchements")
plt.show()