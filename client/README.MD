# Client

To divide the Angular SPA client into modules, we implement one [app]("./apps/client/") which imports [multiple libraries]("./libs/"). The app works as a wrapper for the modules and enables us to build a single artifact. Each library represents one module. 

To organize and maintain the the client structure we use [nx]("https://github.com/nrwl/nx") by nrwl.