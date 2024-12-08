import matplotlib.pyplot as plt

def fibobotup( x):
    L= [0 for i in range(x)]
    L[0]=1
    L[1]=1
    for i in range(2, x):
        L[i] = L[i-1] + L[i-2]
    return L


def fibotab(x):
    L = fibobotup(x)
    T= [i for i in range(x)]
    print(T)
    plt.plot(T,L)
    plt.xlabel("année")
    plt.ylabel("nombre de lapin")
    plt.title("nombre de lapin généré par la suite de fibonacci")
    plt.show()


fibotab(12)

def fibobase(x,y):
    L= [0 for i in range(x)]
    L[0]=y
    L[1]=y
    for i in range(2, x):
        L[i] = L[i-1] + L[i-2]
    print(L[x-1])
    return L



def fibobasetab(x,y):
    L = fibobase(x,y)
    T= [i for i in range(x)]
    print(T)
    plt.plot(T,L)
    plt.xlabel("année")
    plt.ylabel("nombre de lapin")
    plt.title("nombre de lapin généré par la suite de fibonacci")
    plt.show()

fibobasetab(12,1000)