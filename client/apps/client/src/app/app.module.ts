import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';

import { Route, RouterModule } from '@angular/router';

const routes: Route[] = [
  {
    path: 'context-a',
    loadChildren: () => import('@client/context-a').then(m => m.ContextAModule)
  },
  {
    path: 'context-b',
    loadChildren: () => import('@client/context-b').then(m => m.ContextBModule)
  }
];

@NgModule({
  declarations: [AppComponent],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule { }
