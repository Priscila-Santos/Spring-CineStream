// import { bootstrapApplication } from '@angular/platform-browser';
// import { HomePageComponent } from './app/components/home-page/home-page.component'
// import { provideHttpClient, withFetch } from '@angular/common/http';
// import { importProvidersFrom } from '@angular/core';
// import { ReactiveFormsModule } from '@angular/forms';
// import { appConfig } from './app/app.config';
// import { AppComponent } from './app/app.component';
// import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/compiler/';


// bootstrapApplication(AppComponent, appConfig)
//   .catch((err) => console.error(err));

import { bootstrapApplication } from '@angular/platform-browser';
import { HomePageComponent } from './app/components/home-page/home-page.component';
import { provideHttpClient, withFetch } from '@angular/common/http';
import { importProvidersFrom } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { appConfig } from './app/app.config';
import { AppComponent } from './app/app.component';
import { provideAnimationsAsync } from '@angular/platform-browser/animations/async';

bootstrapApplication(AppComponent, {
  ...appConfig,
  providers: [
    ...appConfig.providers,
    importProvidersFrom(ReactiveFormsModule),
    provideHttpClient(withFetch()), provideAnimationsAsync(),
  ]
}).catch((err) => console.error(err));

