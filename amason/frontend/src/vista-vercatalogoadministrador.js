import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-vercatalogoadministrador`
 *
 * VistaVercatalogoadministrador element.
 *
 * @customElement
 * @polymer
 */
class VistaVercatalogoadministrador extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-vercatalogoadministrador';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVercatalogoadministrador.is, VistaVercatalogoadministrador);
