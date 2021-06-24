import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaProductoadministrado extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; align-items: flex-start; margin: var(--lumo-space-m);">
 <vaadin-vertical-layout theme="spacing" style="align-items: stretch; margin-top: var(--lumo-space-xs);">
  <h4 id="h-producto">Producto</h4>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-items: flex-end;">
  <vaadin-checkbox id="checkbox-producto" style="flex-grow: 0; margin-right: var(--lumo-space-m); margin-left: var(--lumo-space-m);">
   🗑
  </vaadin-checkbox>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-productoadministrado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductoadministrado.is, VistaProductoadministrado);
