import { Component, OnInit, Inject, PLATFORM_ID, Renderer2 } from '@angular/core';
import { isPlatformBrowser } from '@angular/common';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss']
})
export class MenuComponent implements OnInit {

  constructor(@Inject(PLATFORM_ID) private platformId: Object, private renderer: Renderer2) {}

  ngOnInit(): void {
    if (isPlatformBrowser(this.platformId)) {
      const linkColor = document.querySelectorAll('.nav-link');
      linkColor.forEach(link => {
        if (window.location.href.endsWith(link.getAttribute('href') || '')) {
          this.renderer.addClass(link, 'active');
        }
        link.addEventListener('click', () => {
          linkColor.forEach(l => this.renderer.removeClass(l, 'active'));
          this.renderer.addClass(link, 'active');
        });
      });
    }
  }

  logout() {
    if (isPlatformBrowser(this.platformId)) {
      localStorage.removeItem('token');
      window.location.reload();
    }
  }
}
